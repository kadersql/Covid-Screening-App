<template>
  <div>
    <div id="officeEntry">
      <div id="pic">
        <img src="../img/te-logo.png" />
      </div>
      <h2 id="entryText">You can enter the building, thank you for your answers</h2>
      <button @click="$router.push({ name: 'Home' })" id="enter">
          Home Page
        </button>
    </div>
  </div>
</template>

<script>
export default {
  name: "officeEntry",
};
</script>

<style>
#officeEntry {
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

#entryText{
    border:solid black 5px;
    height: 75px;
    width: 400px;
    border-radius: 10px;
    padding: 10px;
    margin-top: 150px;
    background-color: #00AFEF;
}

</style>