require: slotfilling/slotFilling.sc
  module = sys.zb-common
require: kek.js
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет приветфывфвый
        a: {{counter.get()}}
        SumTwoNumbers:
            numberOne = 2
            numberTwo = 3
            okState = /AnythingElse

    state: AnythingElse
        a: Посчитать для вас что-нибудь еще?
    
    state: Bye
        intent!: /пока
        a: Пока пока
        script:
           counter.increment()

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}