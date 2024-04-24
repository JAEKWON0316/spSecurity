<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <aside>
            <h4 class="fw-bold">Latest posts</h4>
            <div class="recent-post">
                <a href="#" class="thumb">
                   <div class="recent-post-box"><i class="ri-links-fill"></i></div>
                   <img src="res/images/travel01.jpg" alt="01"/>
                </a>
                <a href="#" class="post-text travel">
                    <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
                </a>
            </div>
            <div class="recent-post">
                <a href="#" class="thumb">
                   <div class="recent-post-box"><i class="ri-links-fill"></i></div>
                   <img src="res/images/travel03.jpg" alt="01"/>
                </a>
                <a href="#" class="post-text fashion">
                    <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
                </a>
            </div>
            <div class="recent-post">
                <a href="#" class="thumb">
                   <div class="recent-post-box"><i class="ri-links-fill"></i></div>
                   <img src="res/images/sports01.jpg" alt="01"/>
                </a>
                <a href="#" class="post-text sports">
                    <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
                </a>
            </div>
            <div class="recent-post">
                <a href="#" class="thumb">
                   <div class="recent-post-box"><i class="ri-links-fill"></i></div>
                   <img src="res/images/sports04.jpg" alt="01"/>
                </a>
                <a href="#" class="post-text photography">
                    <h6 class="fw-bold">이번 여행에서 건진 사진</h6>
                </a>
            </div>
            <div class="searchbox">
                <form class="search">
                    <input type="search" placeholder="SEARCH">
                    <button type="submit"><i class="ri-search-line"></i></button>
                </form>
            </div>
            <div class="posttag">
                <h4 class="fw-bold">Popular tags</h4>
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
    </div>

    <div class="zoombox">
        <div class="close"><i class="fa-solid fa-xmark"></i></div>
        <div class="zoombody"></div>
    </div>
    <div class="signuppopup">
        <h4 class="fw-bold mb-5">회원가입</h4>
        <form>
            <div class="mb-3 me-4 col-6">
                <label for="name" class="form-label">이름</label>
                <input type="text" class="form-control" id="name" placeholder="이름" />
            </div>
            <div class="mb-3 me-4 col-6">
                <label for="username" class="form-label">아이디</label>
                <input type="text" class="form-control" id="username" placeholder="아이디" />
            </div>
            <div class="mb-3 me-4 col-6">
                <label for="password" class="form-label">비밀번호</label>
                <input type="password" class="form-control" id="password" placeholder="비밀번호" />
            </div>
            <div class="mb-3 me-4 col-6">
                <label for="repassword" class="form-label">비밀번호 확인</label>
                <input type="text" class="form-control" id="repassword" placeholder="비밀번호확인" />
            </div>
            <div class="mb-3 me-4 col-12">
                <label for="email" class="form-label">이메일 주소</label>
                <input type="email" class="form-control" id="email" placeholder="이메일주소" />
            </div>
            <div class="mb-3 me-4 col-12">
                <label for="tel" class="form-label">전화번호</label>
                <input type="tel" class="form-control" id="tel" placeholder="전화번호" />
            </div>
            <div class="mt-5 mb-2 text-center">
                <button type="button" class="reset btn btn-danger me-2">Cancel</button>
                <button type="submit" class="btn btn-success ms-2">Submit</button>
            </div>
        </form>
    </div>
    <div class="find-id">
        아이디/패스워드 찾기
    </div>
</body>
</html>