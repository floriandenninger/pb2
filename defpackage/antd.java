package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class antd extends Exception {
    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public antd() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public antd(String str) {
        super(str);
        qip.ay(str, "Detail message must not be empty");
    }
}
