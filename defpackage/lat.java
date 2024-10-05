package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import com.google.android.apps.youtube.app.search.OnlineSearchController;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class lat extends UtteranceProgressListener implements TextToSpeech.OnInitListener, AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ OnlineSearchController a;
    private final int b;
    private final String c;
    private final Locale d;

    public lat(OnlineSearchController onlineSearchController, int i, String str, Locale locale) {
        this.a = onlineSearchController;
        this.b = i;
        this.c = str;
        this.d = locale;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        TextToSpeech textToSpeech;
        if ((i == -3 || i == -2 || i == -1) && (textToSpeech = this.a.f) != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
            this.a.f = null;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onDone(String str) {
        TextToSpeech textToSpeech = this.a.f;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.a.f = null;
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str) {
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onError(String str, int i) {
        StringBuilder sb = new StringBuilder(27);
        sb.append("Error speaking: ");
        sb.append(i);
        zga.m("OnlineSearchController", sb.toString());
        TextToSpeech textToSpeech = this.a.f;
        if (textToSpeech != null) {
            textToSpeech.shutdown();
            this.a.f = null;
        }
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public final void onInit(int i) {
        OnlineSearchController onlineSearchController = this.a;
        TextToSpeech textToSpeech = onlineSearchController.f;
        if (textToSpeech != null) {
            if (i == -1) {
                zga.m("OnlineSearchController", "Failed to initialize TextToSpeech");
                textToSpeech.shutdown();
                this.a.f = null;
                return;
            }
            AudioManager audioManager = (AudioManager) onlineSearchController.A.getSystemService("audio");
            if (audioManager != null) {
                audioManager.requestAudioFocus(this, 3, 2);
            }
            Resources resources = this.a.A.getResources();
            TextToSpeech textToSpeech2 = this.a.f;
            if (textToSpeech2 == null) {
                return;
            }
            if (!Locale.getDefault().equals(this.d)) {
                int isLanguageAvailable = textToSpeech2.isLanguageAvailable(this.d);
                Locale b = aip.b().a.b(new String[]{this.d.toLanguageTag()});
                boolean z = b != null && b.getLanguage().equals(this.d.getLanguage());
                boolean z2 = Locale.getDefault().equals(OnlineSearchController.a) && (this.a.y.i().equals("showing_results_for_alternative_hindi") || this.a.y.i().equals("here_are_some_results_about_alternative_hindi"));
                if (isLanguageAvailable >= 0 && (z || z2)) {
                    textToSpeech2.setLanguage(this.d);
                    Configuration configuration = new Configuration(this.a.A.getResources().getConfiguration());
                    configuration.setLocale(this.d);
                    resources = this.a.A.createConfigurationContext(configuration).getResources();
                }
            }
            textToSpeech2.setOnUtteranceProgressListener(this);
            textToSpeech2.speak(resources.getString(this.b, this.c), 0, Bundle.EMPTY, "utteranceId");
        }
    }

    @Override // android.speech.tts.UtteranceProgressListener
    public final void onStart(String str) {
    }
}
