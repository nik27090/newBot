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