<template>
  <div>
    <el-config-provider :locale="locale">
      <RouterView />
    </el-config-provider>
  </div>
</template>
<script setup lang="ts">
import { ref } from 'vue'
import zhCn from 'element-plus/es/locale/lang/zh-cn'
const locale = ref(zhCn)
</script>
<style scoped></style>
