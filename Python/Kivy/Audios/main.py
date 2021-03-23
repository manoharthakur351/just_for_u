import kivy
from kivy.app import App
from kivy.uix.label import Label
from kivy.core.audio import SoundLoader
class music(App):
    sound=SoundLoader.load('occ.wav')
    def build(self):
        return Label(text="music playing")
    if sound:
        sound.play()
music().run()
