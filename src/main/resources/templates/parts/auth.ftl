<#macro auth path todo>
    <form action="${path}" method="post">
        <div class="form-group">
            <label for="InputUsername">Login</label>
            <input type="text" class="form-control" name="username" id="InputUsername">
        </div>
        <div class="form-group">
            <label for="InputPassword">Password</label>
            <input type="password" class="form-control" name="password" id="InputPassword">
        </div>
        <input type="hidden" name="_csrf" value="${_csrf.token}"/>
        <button type="submit" class="btn btn-primary"> ${todo}</button>
    </form>
</#macro>

<#macro logout>
    <div>
        <form action="/logout" method="post">
            <input type="hidden" name="_csrf" value="${_csrf.token}"/>
            <button type="submit" value="Sign Out" class="btn btn-primary"> Выйти</button>
        </form>
    </div>
</#macro>