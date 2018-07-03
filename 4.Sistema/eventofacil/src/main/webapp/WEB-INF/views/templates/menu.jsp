<%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>

<div class="mdl-layout__drawer">
    <header>EventoFacil</header>
    <nav class="mdl-navigation">
        <a class="mdl-navigation__link" href="${s:mvcUrl('DC#dashboard').build()}">
            <i class="material-icons" role="presentation">dashboard</i>
            Dashboard
        </a>
        <a class="mdl-navigation__link" href="${s:mvcUrl('EC#listarEvento').build()}">
            <i class="material-icons" role="presentation">movie</i>
            Eventos
        </a>
    </nav>
</div>