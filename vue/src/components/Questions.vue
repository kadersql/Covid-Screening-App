

<template>
  <div>
    <div id="questions">
      <div>
        <img src="../img/te-logo.png" />
      </div>

      <div  v-show="q1 != 'hide'">
        <h3 id="ques" >Do you have the following symptoms?</h3>

        <ui id="list">
          <li>New and persistent cough</li>

          <li>Shortness of breath or any difficulty breathing</li>

          <li>Fever</li>
        </ui>

        <button id="enter" v-on:click.prevent="hideQ1">NO</button>
        <button @click="$router.push({ name: 'GoBackHome' })" id="enter">
          YES
        </button>
      </div>

      <div  v-show="q2 == 'show'">
        <h3 id="ques" >
          Have you been contact with anyone in the last 14 days who is
          experiencing these sysmptoms?
        </h3>

        <button id="enter" v-on:click.prevent="hideQ2">NO</button>
        <button @click="$router.push({ name: 'GoBackHome' })" id="enter">
          YES
        </button>
      </div>

      <div  v-show="q3 == 'show'">
        <h3 id="ques" >
          Have you been in contact with anyone who has since tested positive for
          Covid-19?
        </h3>

        <button id="enter" v-on:click.prevent="hideQ3">NO</button>
        <button @click="$router.push({ name: 'GoBackHome' })" id="enter">
          YES
        </button>
      </div>

      <div  v-show="q4 == 'show'">
        <h3 id="ques">Have you travelled outside state in the last 14 days?</h3>

        <button @click="$router.push({ name: 'officeEntry' })" id="enter">
          NO
        </button>
        <button @click="$router.push({ name: 'GoBackHome' })" id="enter">
          YES
        </button>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "Questions",
  data() {
    return {
      q1: "",
      q2: "",
      q3: "",
      q4: "",
    };
  },

  methods: {
    hideQ1() {
      this.q1 = "hide";
      this.q2 = "show";
    },
    hideQ2() {
      this.q2 = "hide";
      this.q3 = "show";
    },
    hideQ3() {
      this.q3 = "hide";
      this.q4 = "show";
    },
  },
};
</script>

<style>
#questions {
  display: flex;
  flex-direction: column;
  width: 50%;
  height: 500px;
  padding: 25px;
  align-items: center;
  background-color: cadetblue;
  color: black;
  border: solid black;
  border-radius: 10px;
}
#list {
  display: flex;
  flex-direction: column;
  align-items: flex-start;
  padding: 15px;
  border: solid 5px black;
  border-radius: 10px;
  margin-block: 10px;
  background-color: #00AFEF;
}

#ques{
  border:solid black 5px;
    height: 75px;
    width: 400px;
    border-radius: 10px;
    padding: 10px;
    margin-top: 50px;
    background-color: #00AFEF;
}

h3 {
  padding: 10px;
}
</style>