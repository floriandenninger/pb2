package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cre extends cri {
    public cre(ContentResolver contentResolver, Uri uri) {
        super(contentResolver, uri);
    }

    @Override // defpackage.cqw
    public final Class a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.cri
    protected final /* bridge */ /* synthetic */ Object f(Uri uri, ContentResolver contentResolver) {
        AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
        if (openAssetFileDescriptor == null) {
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("FileDescriptor is null for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        }
        return openAssetFileDescriptor.getParcelFileDescriptor();
    }

    @Override // defpackage.cri
    protected final /* synthetic */ void g(Object obj) {
        ((ParcelFileDescriptor) obj).close();
    }
}
