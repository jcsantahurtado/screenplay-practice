Feature: Automation Practice Screenplay
  Yo como aprendiz de automatización
  Necesito agregar un registro en la página de prueba
  Para evaluar lo aprendido en automatización

  Scenario Outline: Seleccionar fecha
    Given Necesito ingresar a la pagina
    When Selecciono "<year>", "<month>" y "<day>" en la opcion Select Date
    And Selecciono "<year>", "<month>", "<day>" y "<time>" en la opcion Select Date And Time
    Then Valido que la fecha tenga el "<month>" correcto

    Examples:
      | year | month    | day | time  |
      | 2022 | December | 15  | 21:45 |
