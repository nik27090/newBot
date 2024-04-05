require: slotfilling/slotFilling.sc
  module = sys.zb-common
theme: /

<<<<<<< HEAD
=======
    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет приве  тqwe
        a: Привет приве  тqwe
        a: Привет приве  тqwe
        a: Привет приве  тqwe
        a: Привет приве  тqwe
        a: Привет приве  тqwe
        a: Привет приве  тqwe
        a: Привет приве  тqwe


    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}
>>>>>>> branch 'master' of https://github.com/nik27090/newBot.git
