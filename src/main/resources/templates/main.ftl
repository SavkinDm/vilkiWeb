<#import "parts/common.ftl" as c>
<#import "parts/navbar.ftl" as nav>
<@c.page>



    <div class="container">
        <div class="row">
            <div class="col">

            </div>
            <div class="col-12">
                <@nav.navbar />
            </div>
            <div class="col">

            </div>

        </div>
        <div class="row my-4">
            <div class="col">

            </div>
            <div class="col-12">
                <h1>
                    На данный момент найденно ${kolvo} вилок с 9 букмекерских контор
                </h1>
            </div>
            <div class="col">

            </div>
        </div>

        <div class="row">
            <div class="col">

            </div>
            <div class="col-12">

                <div>
                    <p>
                        <button class="btn btn-dark" type="button" data-toggle="collapse" data-target="#collapseExample"
                                aria-expanded="false" aria-controls="collapseExample">
                            Фильтр
                        </button>
                    </p>
                    <div class="collapse" id="collapseExample">

                        <form action="/filter">
                            <div class="container">
                                <div class="row">
                                    <div class="col-sm">
                                        <label for="InputIncomePercent">Процент прибыли</label>
                                        <input type="number" class="form-control" name="IncomePercent"
                                               id="InputIncomePercent">
                                    </div>
                                    <div class="col-sm">
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="betcity" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="BetCity">
                                                BetCity
                                            </label>
                                        </div>
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="BetMaster" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="BetMaster">
                                                BetMaster
                                            </label>
                                        </div>
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="fanSport" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="Fansport">
                                                Fansport
                                            </label>
                                        </div>
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="fonbet" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="Fonbet">
                                                Fonbet
                                            </label>
                                        </div>
                                    </div>
                                    <div class="col-sm">
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="Leon" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="Leon">
                                                Leon
                                            </label>
                                        </div>
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="LigaStavok" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="LigaStavok">
                                                Liga stavok
                                            </label>
                                        </div>
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="MelBet365" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="Melbet">
                                                Melbet365
                                            </label>
                                        </div>
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="MostBet" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="Mostbet">
                                                Mostbet
                                            </label>
                                        </div>
                                    </div>
                                    <div class="col-sm">
                                        <div class="custom-control custom-checkbox">
                                            <input class="form-check-input" type="checkbox" value="OlimpBet" name="BK"
                                                   id="BK">
                                            <label class="form-check-label" for="OlimpBet">
                                                OlimpBet
                                            </label>
                                        </div>
                                    </div>
                                    <div class="col-sm">
                                    </div>
                                </div>

                                <div class="row py-3">
                                    <div class="col-sm">
                                    </div>
                                    <div class="col-sm">
                                    </div>
                                    <div class="col-sm">
                                    </div>
                                    <div class="col-sm ">
                                        <div>
                                            <button type="submit" class="btn btn-dark"> Применить</button>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>

            </div>
            <div class="col">

            </div>
        </div>


        <div class="row">
            <div class="col">

            </div>
            <div class="col-12">
                <table class="table table-striped ">
                    <thead>
                    <tr>
                        <th scope="col">Прибыль

                            <#if sorti == 0 || sorti == -1>
                                <a href="/main/sort?type=1">

                                    <img src="/img/strelUp.png" height="10" width="17">
                                </a>
                            <#elseif sorti == 1>
                                <a href="/main/sort?type=-1">

                                    <img src="/img/strelDown.png" height="10" width="17">
                                </a>
                            <#else>

                                <a href="/main/sort?type=-1">

                                    <img src="/img/strelDown.png" height="10" width="17">
                                </a>
                            </#if>


                        </th>
                        <th scope="col">БК</th>
                        <th scope="col">Вид спорта</th>
                        <th scope="col">Событие</th>
                        <th scope="col">Время начала</th>
                        <th scope="col">Тип ставки</th>
                        <th scope="col">Коэффициенты</th>
                    </tr>
                    </thead>
                    <tbody>
                    <#list list as vilka>
                        <tr>
                            <td><br/>${vilka.getIncome()}%</td>
                            <td>${vilka.getBkName1()} <br/> <br/> ${vilka.getBkName2()}</td>
                            <td><br/>${vilka.getKindOfSport()}</td>
                            <td>${vilka.getBk1team1()} <br/> <br/> ${vilka.getBk1team2()}</td>
                            <td><br/>${vilka.getStartTimeNormal()}</td>
                            <td>${vilka.getTypeBk1()} <br/> <br/> ${vilka.getTypeBk2()}</td>
                            <td>${vilka.getBkName1coef()} <br/> <br/>${vilka.getBkName2coef()}</td>
                        </tr>


                    </#list>


                    </tbody>
                </table>
            </div>
            <div class="col">

            </div>
        </div>

    </div>
    </div>


</@c.page>
