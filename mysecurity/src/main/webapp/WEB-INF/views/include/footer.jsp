<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <aside>
         <h4 class="fw-bold">Latest posts</h4>
         <div class="recent-post">
            <div class="recent-post-box"><i class="ri-links-line"></i></div>
            <a href="#" class="thumb">
                <img src="res/images/trable1.jpeg" alt="01">
            </a>
            <a href="#" class="post-text trable">
                <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
            </a>
         </div>
         <div class="recent-post">
            <div class="recent-post-box"><i class="ri-links-line"></i></div>
            <a href="#" class="thumb">
                <img src="res/images/trable.jpg" alt="01">
            </a>
            <a href="#" class="post-text sport">
                <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
            </a>
         </div>
         <div class="recent-post">
            <div class="recent-post-box"><i class="ri-links-line"></i></div>
            <a href="#" class="thumb">
                <img src="res/images/trable3.jpg" alt="01">
            </a>
            <a href="#" class="post-text fassion">
                <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
            </a>
         </div>
         <div class="recent-post">
            <div class="recent-post-box"><i class="ri-links-line"></i></div>
            <a href="#" class="thumb">
                <img src="res/images/trable1.jpeg" alt="01">
            </a>
            <a href="#" class="post-text photography">
                <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
            </a>
         </div>
         <div class="searchbox">
            <form action="" class="search">
                <input type="search" placeholder="search">
                <button type="submit"><i class="ri-search-line"></i></button>
            </form>
         </div><b></b>
         <div class="posttag">
            <h4 class="fw-bold">Popular tag</h4>
            <div class="d-flex flex-wrap">
                <a href="#">bike</a>
                <a href="#">제주도</a>
                <a href="#">야구</a>
                <a href="#">국가대표</a>
                <a href="#">뛰어다니기</a>
                <a href="#">jumping</a>
                <a href="#">lake</a>
                <a href="#">motivation</a>
                <a href="#">notebook</a>
            </div>
         </div>
        </aside>
 
 <div class="zoombox">
        <div class="close"><i class="fa-solid fa-xmark"></i></div>
        <div class="zoombody"></div>
    </div>
    <div class="signuppopup">
       <h4 class="fw-bold mb-5">회원가입</h4>
       <form name="joinForm" id="joinForm" method="post">
         <div class="mb-3 me-4 row">
            <label for="uname" class="form-label col-2 text-end">이름</label>
            <div class="col-6">
               <input type="text" class="form-control" name="uname" id="uname" placeholder="이름">
            </div>
         </div>
         <div class="mb-3 me-4 row">
            <label for="username" class="form-label col-2 text-end">아이디</label>
            <div class="col-6">
               <input type="text" class="form-control col-6" id="username" name="username" placeholder="아이디">
               <input type="hidden" id="cid" />
            </div>
            <div class="col-4">
               <button type="button" class="btn btn-primary" id="checkid" >중복확인</button>
            </div>
         </div>

         <div class="mb-3 me-4 row">
            <label for="password" class="form-label col-2 text-end">비밀번호</label>
            <div class="col-6">
               <input type="password" class="form-control" name="password" id="password" placeholder="비밀번호">
            </div>
         </div>
         <div class="mb-3 me-4 row">
            <label for="repassword" class="form-label  col-2 text-end">비밀번호 확인</label>
            <div class="col-6">
               <input type="password" class="form-control" bane="repassword" id="repassword" placeholder="비밀번호확인">
            </div>
         </div>
         <div class="mb-3 me-4 row">
            <label for="email" class="form-label col-2 text-end">이메일 주소</label>
            <div class="col-7">
                <input type="email" class="form-control" id="useremail" name="useremail" placeholder="이메일주소">
                <input type="hidden" id="cemail" />
            </div>
            <div class="col-3">    
                <button type="button" class="btn btn-primary" id="checkemail" >중복확인</button>
            </div>    
         </div>
         <div class="mb-3 me-4 row">
            <label for="tel" class="form-label col-2">전화번호</label>
            <div class="col-7">
               <input type="tel" class="form-control" id="usertel" name="usertel" placeholder="전화번호">
            </div>
         </div>
         <div class="mt-5 mb-2 text-center">
            <button type="button" class="reset btn btn-danger me-2">Cancle</button>
            <button type="submit" class="btn btn-success ms-2">Submit</button>
         </div>
       </form>
    </div>
    <div class="find-id">
       아이디/패스워드 찾기
    </div>
</body>
</html>