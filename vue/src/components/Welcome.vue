<template>
  <div>
    <div id="welcome">
      <div>
        <img src="../img/te-logo.png" />
      </div>
      <h2>Welcome to Tech Elevator</h2>

      <h3>Covid Screening Test</h3>

      <h3>Please enter your employee ID</h3>

      <div id="idInput">
        <input id="input" v-model="employeeId" class="emp" type="text" />

        <button id="enter" v-on:click.prevent="employeeCheck">Enter</button>
        <br />
      </div>
      <div v-show="employee.name">
        <h3>Welcome {{ employee.name }}</h3>
        <button
          @click="$router.push({ name: 'Questions' })"
          id="enter"
          v-on:click.prevent="employeeCheck"
        >
          Lets answer some questions
        </button>
      </div>
    </div>
  </div>
</template> 



<script>
import employeeService from "../services/employeeService.js";

export default {
  name: "Welcome",
  data() {
    return {
      employee: {},

      employeeId: "",
    };
  },

  methods: {
    employeeCheck() {
      employeeService.getEmployee(this.employeeId).then((response) => {
        this.employee = response.data;
      });
    },
  },
};
</script>


<style>
#welcome {
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
#idInput {
  display: flex;

  padding: 10px;
  justify-content: space-between;
}

#enter {
  border: solid 5px green;
  padding-right: 10px;
  border-radius: 8px;
  font-weight: bold;
  font-size: 20px;
  margin: 10px;
}
#input {
  border: solid 5px;
  border-radius: 10px;
  padding: 10px;
}
</style>
