Feature: Automation Practice Screenplay
  Yo como aprendiz de automatización
  Necesito agregar un registro en la página de prueba
  Para evaluar lo aprendido en automatización

  Scenario Outline: Eliminar registro
    Given Necesito ingresar a la pagina
    When Elimino el registro con id "<record_id>" de la tabla
    Then Valido que el registro con id "<record_id>" quede eliminado

    Examples:
      | record_id |
      | 2         |
