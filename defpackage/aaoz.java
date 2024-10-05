package defpackage;

import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class aaoz implements amnv {
    public final azrw a;
    public PlayerConfigModel b;
    private final anhy c;

    public aaoz(azrw azrwVar) {
        this.a = azrwVar;
        this.c = ((abep) azrwVar.get()).e();
    }

    @Override // defpackage.amnv
    @Deprecated
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final synchronized PlayerConfigModel get() {
        if (this.b == null) {
            PlayerConfigModel playerConfigModel = null;
            try {
                playerConfigModel = new PlayerConfigModel((atyi) this.c.get());
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (ExecutionException e) {
                zga.d("Failed to read PlayerConfig from ProtoDataStore.", e);
            }
            if (playerConfigModel == null) {
                playerConfigModel = PlayerConfigModel.b;
            }
            this.b = playerConfigModel;
        }
        return this.b;
    }
}
