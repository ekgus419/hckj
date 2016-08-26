<%@ page language="java" pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>

<script src="${pageContext.request.contextPath}/js/travelInfo/vendor/modernizr.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/travelInfo/vendor/jquery-1.10.2.min.js"></script>
<script src="${pageContext.request.contextPath}/js/travelInfo/vendor/jquery-ui-1.10.3.custom.min.js"></script>
<script src="${pageContext.request.contextPath}/js/travelInfo/vendor/jquery.ba-throttle-debounce.min.js"></script>
<script src="${pageContext.request.contextPath}/js/travelInfo/vendor/imagesloaded.pkgd.min.js"></script>
<script src="${pageContext.request.contextPath}/js/travelInfo/vendor/masonry.pkgd.min.js"></script>
<script src="${pageContext.request.contextPath}/js/travelInfo/main.js"></script>

<div class="content">
	<div class="page-main" role="main">
		<form class="filter-form" id="gallery-filter">
		    <span class="form-item">
		        <input type="radio" name="filter" id="filter-all" value="all" checked>
		        <label for="filter-all">All</label>
		    </span>
		    <span class="form-item">
		        <input type="radio" name="filter" id="filter-people" value="people">
		        <label for="filter-people">People</label>
		    </span>
		    <span class="form-item">
		        <input type="radio" name="filter" id="filter-animals" value="animals">
		        <label for="filter-animals">Animals</label>
		    </span>
		    <span class="form-item">
		        <input type="radio" name="filter" id="filter-nature" value="nature">
		        <label for="filter-nature">Nature</label>
		    </span>
		    <span class="form-item">
		        <input type="radio" name="filter" id="filter-plantes" value="plantes">
		        <label for="filter-plantes">Plantes</label>
		    </span>
		    <span class="form-item">
		        <input type="radio" name="filter" id="filter-architects" value="architects">
		        <label for="filter-architects">Architects</label>
		    </span>
		</form>
		<br /><br /><br /><br />
	    <ul class="gallery" id="gallery"></ul>
	    <button class="load-more" id="load-more">더 보기</button>
	</div>
</div>