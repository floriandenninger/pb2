package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqs extends cri {
    public cqs(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.cqw
    public final Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.cri
    protected final /* bridge */ /* synthetic */ Object f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor != null) {
            return openAssetFileDescriptor;
        }
        String valueOf = String.valueOf(uri);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("FileDescriptor is null for: ");
        sb.append(valueOf);
        throw new FileNotFoundException(sb.toString());
    }

    @Override // defpackage.cri
    protected final /* synthetic */ void g(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }
}
