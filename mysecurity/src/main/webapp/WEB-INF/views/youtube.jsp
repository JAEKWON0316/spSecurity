<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="include/header.jsp" %>
 <div class="main">
            <div class="container-fluid">
                <div class="row">
                <h1 class="mb-5">My Youtube Link</h1>
                    <div class="col-md-4 mb-4">
                        <a href="#" data-id="DPg8wNTLQPg" class="card-youtube border d-block">  
                            <img src="https://i1.ytimg.com/vi/DPg8wNTLQPg/hqdefault.jpg" class="img-fluid" alt="YouTube video player"/>  <!--hqdefault.jpg는 영상 기본이미지(썸네일)를 이미지로 쓸 수 있다.-->
                            <h5 class="p-3">작은 도시 순천이 이렇게 아름답냐?</h5>
                        </a> 
                    </div>

                    <div class="col-md-4 mb-4">
                        <a href="#" data-id="ts7xa3UPBWc" class="card-youtube border d-block">  
                            <img src="https://i1.ytimg.com/vi/ts7xa3UPBWc/hqdefault.jpg" class="img-fluid" alt="YouTube video player"/>  <!--hqdefault.jpg는 영상 기본이미지(썸네일)를 이미지로 쓸 수 있다.-->
                            <h5 class="p-3">나는 태어난 지 31일 된 수달 새끼다</h5>
                        </a> 
                    </div>
                
                    <div class="col-md-4 mb-4">
                        <a href="#" data-id="OSPokZYFPtw" class="card-youtube border d-block">  
                            <img src="https://i1.ytimg.com/vi/OSPokZYFPtw/hqdefault.jpg" class="img-fluid" alt="YouTube video player"/>  <!--hqdefault.jpg는 영상 기본이미지(썸네일)를 이미지로 쓸 수 있다.-->
                            <h5 class="p-3">윤아가 여태 토크쇼를 안나갔던 이유</h5>
                        </a> 
                    </div>

                    <div class="col-md-4 mb-4">
                        <a href="#" data-id="K7X8VBtQLGs" class="card-youtube border d-block">  
                            <img src="https://i1.ytimg.com/vi/K7X8VBtQLGs/hqdefault.jpg" class="img-fluid" alt="YouTube video player"/>  <!--hqdefault.jpg는 영상 기본이미지(썸네일)를 이미지로 쓸 수 있다.-->
                            <h5 class="p-3">[ENG] 여기 말랑콩떡 떨어뜨리셨어요</h5>
                        </a> 
                    </div>  

                    <div class="col-md-4 mb-4">
                        <a href="#" data-id="oRDyoxDNmmg" class="card-youtube border d-block">  
                            <img src="https://i1.ytimg.com/vi/oRDyoxDNmmg/hqdefault.jpg" class="img-fluid" alt="YouTube video player"/>  <!--hqdefault.jpg는 영상 기본이미지(썸네일)를 이미지로 쓸 수 있다.-->
                            <h5 class="p-3">Playlist (www.싸이월드.com)</h5>
                        </a> 
                    </div>

                    <div class="col-md-4 mb-4">
                        <a href="#" data-id="TcNCFPqo_Vw" class="card-youtube border d-block">  
                            <img src="https://i1.ytimg.com/vi/TcNCFPqo_Vw/hqdefault.jpg" class="img-fluid" alt="YouTube video player"/>  <!--hqdefault.jpg는 영상 기본이미지(썸네일)를 이미지로 쓸 수 있다.-->
                            <h5 class="p-3">봄에 어울리는 감성곡 🎶 가장 핫한 발라드 100곡</h5>
                        </a> 
                    </div>
                    
                    <!--loop-->
                
                </div>                 
            </div>
    </div> <!--/가운데-->
     <div class="youtube-popup">
        <div class="close"><i class="fa-solid fa-xmark"></i></div>
        <div class="youtube-body"><iframe width="900" height="500" id="youtube" src="https://www.youtube.com/embed/Zn8Szu6A17w?si=LdTR8CCq6esklhCL" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share" referrerpolicy="strict-origin-when-cross-origin" allowfullscreen></iframe></div>
    </div>
 <%@ include file="include/footer.jsp" %>    