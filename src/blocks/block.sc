theme: /Blocks

    state: SumTwoNumbers
        script:
            # 1
            $temp.numberOne = $request.data.args.numberOne;
            $temp.numberTwo = $request.data.args.numberTwo;
            # 2
            $temp.result = parseFloat($temp.numberOne) + parseFloat($temp.numberTwo);
        # 3
        if: !isNaN($temp.result)
            a: {{$temp.numberOne}} + {{$temp.numberTwo}} = {{$temp.result}}
            # 4
            if: $request.data.args.okState
                go!: {{$request.data.args.okState}}
        # 5
        elseif: $request.data.args.errorState
            go!: {{$request.data.args.errorState}}
        else:
            a: Я не знаю, как посчитать {{$temp.numberOne}} + {{$temp.numberTwo}}.