String str = "hello";
str = str.toUpperCase();
System.out.println(str);

Вопрос: Почему String "не меняется" после toUpperCase()?



StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10000; i++) {
sb.append(i);  // ❌ МЕДЛЕННО!
}


Вопрос: Почему s += i в цикле медленно?

String text = "hello    world";  // несколько пробелов
String[] words = text.split(" ");
System.out.println(Arrays.toString(words));

Вопрос: Почему split(" ") ломается?