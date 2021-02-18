import Vue from 'vue'
import VueRouter from 'vue-router'
import Home from '../views/Home.vue'
import Questions from '../components/Questions'
import officeEntry from '../components/officeEntry'
import GoBackHome from '../components/GoBackHome'
import Welcome from '../components/Welcome'




Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Home',
    component: Home
  },
  {
    path: '/welcome',
    name: 'Welcome',
    component: Welcome
  },
  {
    path: '/questions',
    name: 'Questions',
    component: Questions
  },
  {
    path: '/GoBackHome',
    name: 'GoBackHome',
    component: GoBackHome
  },
  {
    path: '/officeEntry',
    name: 'officeEntry',
    component: officeEntry
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  }
]

const router = new VueRouter({
  routes
})

export default router
