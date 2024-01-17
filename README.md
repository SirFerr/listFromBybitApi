Данное приложение получает данные посредством Retrofit

Модель:

  Запрос:
  
  ![image](https://github.com/SirFerr/listFromBybitApi/assets/7862646/438200c7-7833-4d69-801f-94f021f191bd)
  
  Экземляр ретрофита:
  
  ![image](https://github.com/SirFerr/listFromBybitApi/assets/7862646/449498c3-2ab7-4723-b9ad-7d6c811cbfdc)
  
  Retrofit конвертирует json в классы:
  AnnouncementResponse
    Result
      Item
        ItemType
				

ViewModel:

  В BybitViewModel реализуеться связь с моделью
  getAnnouncements() выполняет запрос

View:

Функция list() создает lazyCollumn и вызывает функцию getAnnouncements()

Фунция listItem() создает элемент lazyCollumn-а с данными полученными из getAnnouncements()


Работа приложения:

  При запуске приложения список пустой, спустя несколько секунд, после получения данных из api, он заполняеться.
  
  После получения данных:
  
  ![image](https://github.com/SirFerr/listFromBybitApi/assets/7862646/1719c2d5-df76-4075-a1df-b5a12850b354)
