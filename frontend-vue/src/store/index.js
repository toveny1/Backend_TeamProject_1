import { createStore } from 'vuex'

const user = JSON.parse(localStorage.getItem("user"));

export default createStore({
  state: {
    loggedIn: user ? true : false, // 로그인 여부
    user: user ? user : null, // 로그인 정보(웹토큰속성 있음)
  },
  getters: {
  },
  mutations: {
    // TODO: 로그인 성공함수
    //  => loggedIn(로그인여부 속성) = true , user(유저 객체) = user 객체 저장
    loginSuccess(state, user) {
      state.loggedIn = true;
      state.user = user;
    },
    // TODO: 로그인 실패함수
    loginFailure(state) {
      state.loggedIn = false;
      state.user = null;
    },
    // TODO: 로그아웃함수
    logout(state) {
      state.loggedIn = false;
      state.user = null;
    },
    // TODO: 회원가입성공함수
    registerSuccess(state) {
      state.loggedIn = false;
    },
    // TODO: 회원가입실패함수
    registerFailure(state) {
      state.loggedIn = false;
    },
  },
  actions: {
  },
  modules: {
  }
})