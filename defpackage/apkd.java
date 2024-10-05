package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apkd extends aonm implements aooz {
    public static final apkd a;
    private static volatile aopf g;
    public int b;
    public apkh c;
    public apkf d;
    public apke e;
    public atdu f;
    private apkj h;
    private byte i = 2;

    static {
        apkd apkdVar = new apkd();
        a = apkdVar;
        aonm.registerDefaultInstance(apkd.class, apkdVar);
    }

    private apkd() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.i);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.i = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\ue5d8ᡈ\ue496㴵\u0005\u0000\u0000\u0005\ue5d8ᡈᐉ\u0004\uf03a⮔ᐉ\u0000ﭥ㇃ᐉ\u0001\ue5b3㇊ᐉ\u0002\ue496㴵ᐉ\u0003", new Object[]{"b", "h", "c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new apkd();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (apkd.class) {
                        aopfVar = g;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            g = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
