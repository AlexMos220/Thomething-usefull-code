//есть объекты Horse в полями name и distance.  Перебираем список и находим с наибольшей distance

Optional<Horse> winner = horses.stream().max(Comparator.comparingDouble(Horse::getDistance));
//возвращает объект Horse из объекта Optional, но нужны проверки
return winner.get();   
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++