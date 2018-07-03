<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ taglib tagdir="/WEB-INF/tags" prefix="tags" %>

<tags:pageTemplate titulo="${titulo}">

	<main class="mdl-layout__content">
	    <div class="mdl-grid mdl-grid--no-spacing">
	
	        <div class="mdl-grid mdl-cell mdl-cell--9-col-desktop mdl-cell--12-col-tablet mdl-cell--4-col-phone mdl-cell--top">
	
	            <!-- Weather widget-->
	            <div class="mdl-cell mdl-cell--4-col-desktop mdl-cell--4-col-tablet mdl-cell--2-col-phone">
	                <div class="mdl-card mdl-shadow--2dp weather">
	                    <div class="mdl-card__title">
							<h2 class="mdl-card__title-text">Próximo Evento</h2>
	
	                        <div class="mdl-layout-spacer"></div>
	                        <div class="mdl-card__subtitle-text">
	                            <i class="material-icons">room</i>
								Goiás, Brasil
	                        </div>
	                    </div>
	                    <div class="mdl-card__supporting-text mdl-card--expand">
							<p class="weather-temperature">10/02<sup></sup></p>
							<h3 class="mdl-card__title-text">Campeonato Pernas de Pal</h3>
							<h1 class="mdl-card__title-text">10:30 AM</h1>
	                    </div>
	                </div>
	            </div>
	            <!-- Trending widget-->
	            <div class="mdl-cell mdl-cell--4-col-desktop mdl-cell--4-col-tablet mdl-cell--2-col-phone">
	                <div class="mdl-card mdl-shadow--2dp trending">
	                    <div class="mdl-card__title">
	                        <h2 class="mdl-card__title-text">Seus Eventos</h2>
	                    </div>
	                    <div class="mdl-card__supporting-text">
	                        <ul class="mdl-list">
	                            <li class="mdl-list__item">
									<span class="mdl-list__item-primary-content list__item-text">Aniversário Júlia</span>
	                                <span class="mdl-list__item-secondary-content trending__percent">1 º</span>
	                            </li>
	                            <li class="mdl-list__item list__item--border-top">
									<span class="mdl-list__item-primary-content list__item-text">Campeonato Pernas de Pal</span>
	                                <span class="mdl-list__item-secondary-content trending__percent">2 º</span>
	                            </li>
	                            <li class="mdl-list__item list__item--border-top">
									<span class="mdl-list__item-primary-content list__item-text ">Festa do ano</span>
	                                <span class="mdl-list__item-secondary-content trending__percent">3 º</span>
	                            </li>
	                            <li class="mdl-list__item list__item--border-top">
									<span class="mdl-list__item-primary-content list__item-text">Meu aniversário</span>
	                                <span class="mdl-list__item-secondary-content trending__percent">4 º</span>
	                            </li>
	                        </ul>
	                    </div>
	                </div>
	            </div>
				<div class="mdl-cell mdl-cell--4-col-desktop mdl-cell--4-col-tablet mdl-cell--2-col-phone">
					<div class="mdl-card mdl-shadow--2dp mickey_mouse">
						<div class="mdl-card__title mdl-card--expand">
							<h2 class="mdl-card__title-text">Novidades</h2>
						</div>
						<div class="mdl-card__supporting-text">
							<div>
								Fornecedor "Imagine Eventos" do evento "Aniversário Júlia" confirmou serviço.
							</div>
						</div>
					</div>
				</div>
	        </div>
	    </div>
	
	</main>
</tags:pageTemplate>