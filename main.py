import sys

from gtts import gTTS

def getDataFromJava(arg1):
      text_to_say = arg1

      language = "en"

      gtts_object = gTTS(text = text_to_say,lang = language,slow = False)

      gtts_object.save("wi.mp3")


arg1 = sys.argv[1]

getDataFromJava(arg1)
