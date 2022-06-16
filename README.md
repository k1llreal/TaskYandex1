# TaskYandex1

<strong>Тестовое задание в академию Яндекс Java <strong>

Саша разрабатывает игру «Отгадай слово». В этой игре, игрок должен отгадать загаданное слово из 
N
 букв за несколько попыток.
В данный момент перед Сашей стоит задача написать логику проверки величины совпадения попытки игрока с загаданным словом.
Более формально, пусть есть строка 
S
 — загаданное слово и строка 
Q
 — попытка игрока. Обе строки имеют одинаковую длину 
N
. Для каждой позиции 
1
≤
i
≤
N
 строки 
Q
, нужно вычислить тип совпадения в этой позиции со строкой 
S
.
Если 
Qi=Si
, то в позиции 
i
 тип совпадения должен быть равен 
c
o
r
r
e
c
t
.
Если 
Q
i
≠
Si, но существует другая позиция 
1
≤
j
≤
N
, такая что 
Qi=Sj, то в позиции i
 тип совпадения должен быть равен 
p
r
e
s
e
n
t
.

Каждую букву строки 
S
 можно использовать не более чем в одном совпадении типа 
c
o
r
r
e
c
t
 или 
p
r
e
s
e
n
t
.
Приоритет всегда отдается типу 
c
o
r
r
e
c
t
.
Из всех возможных вариантов использования в типе 
p
r
e
s
e
n
t
 программа Саши выбирает самую левую позицию в строке 
Q
.
В остальных позициях тип совпадения должен быть равен 
a
b
s
e
n
t
.
 
 <br>
 <strong>Формат ввода<strong>
  <br>
В первой строке задана строка 
S
 (
1
≤
∣
∣
S
∣
∣
≤
1
0
6
) — загаданное слово.
Во второй строке задана строка 
Q
 (
|
Q
|
=
|
S
|
) — попытка игрока.
Гарантируется, что строки 
S
 и 
Q
 содержат только заглавные латинские буквы.

Формат вывода
Выведите 
N
 строк. В строке 
i
 должна находиться одна из строк 
c
o
r
r
e
c
t
, 
p
r
e
s
e
n
t
 или 
a
b
s
e
n
t
 — результат совпадения в позиции 
i
 строки 
Q
 со строкой 
S
.
