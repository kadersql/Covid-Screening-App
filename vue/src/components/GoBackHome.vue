<template>
  <div>
    <div id="goBackHome">
      <div>
        <img src="../img/te-logo.png" />
      </div>
      <h1 id="goHomeText">Please go home and contact company HR</h1>
      <button @click="$router.push({ name: 'Home' })" id="enter">
          Home Page
        </button>
      
    </div>
  </div>
</template>

<script>
export default {
  name: "GoBackHome",
};
</script>

<style>
#goBackHome {
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
#goHomeText{
    border:solid black 5px;
    height: 75px;
    width: 400px;
    border-radius: 10px;
    padding: 10px;
    margin-top: 150px;
    background-color: #00AFEF;
}
</style>