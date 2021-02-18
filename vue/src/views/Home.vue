<template>
  <div class="home">
    <div>
      <Welcome />
    </div>
  </div>
</template>

<script>
// @ is an alias to /src
import Welcome from "@/components/Welcome.vue";

export default {
  name: "Home",
  components: {
    Welcome,
  },
};
</script>
<style>
.home {
  display: flex;
  flex-direction: column;
}
</style>
