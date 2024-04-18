import { ref } from 'vue'
import { defineStore } from 'pinia'

export const useCounterStore = defineStore('app', () => {
  const title = ref(import.meta.env.VITE_APP_TITLE)
  function setTitle(value: string) {
    title.value = value
  }

  return { title, setTitle }
})
