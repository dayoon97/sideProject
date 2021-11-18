<template>
  <div class="btn-container">
    <div class="btn-1">
      <p>신청갈겨보자고</p>
      <span class="s-1"><img class="sg-1" alt="sunglasses emoji" src="../assets/sunglasses.png"></span>
    </div>
  </div>
</template>

<script>
export default {
  name: "submit"
}
</script>

<style scoped>
.btn-container{
  position: fixed;
  bottom: 30px;
  width: 100%;
}
.btn-1 {
  margin: 0 auto;
  width: 286px;
  height: 59px;
  background: linear-gradient(75.66deg, rgba(68, 79, 198, 0.174) 28.88%, rgba(81, 95, 238, 0.144) 46.31%, rgba(198, 202, 245, 0.0428108) 59.65%, rgba(248, 248, 248, 0) 70.19%), rgba(81, 95, 238, 0.96);
  background-blend-mode: multiply, normal;
  border-radius: 18px;
  line-height: initial;
  text-align: center;
  cursor: pointer;
}
p {
  width: 160px;
  height: 23px;
  margin: 40px 0 0;
  font-family: Roboto;
  font-style: normal;
  font-weight: normal;
  font-size: 20px;
  line-height: 23px;
  color: #FFFFFF;
  display: flex;
}
.s-1 {
  display: flex;
  display: inline-block;
}
.sg-1 {
  margin: auto;
  width: 34px;
  height: 35px;
}
</style>