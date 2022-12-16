Feature: Automation Practice Screenplay
  Yo como aprendiz de automatización
  Necesito agregar un registro en la página de prueba
  Para evaluar lo aprendido en automatización

  Scenario Outline: Agregar registro
    Given Necesito ingresar a la pagina
    When Agrego "<firstname>", "<lastname>", "<email>", "<age>", "<salary>" y "<department>" a la tabla
    Then Valido que "<lastname>" quede ingresado el registro

    Examples:
      | firstname | lastname | email            | age | salary | department |
      | Juan      | Santa    | juan@example.com | 23  | 400    | QA         |
