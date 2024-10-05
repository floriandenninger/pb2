package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apkm extends aonm implements aooz {
    public static final apkm a;
    private static volatile aopf b;
    private int c;
    private avul d;
    private aqkv e;
    private byte f = 2;

    static {
        apkm apkmVar = new apkm();
        a = apkmVar;
        aonm.registerDefaultInstance(apkm.class, apkmVar);
    }

    private apkm() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.f);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.f = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0002\u0000\u0001ﱃ\u196f\ue607⨅\u0002\u0000\u0000\u0002ﱃ\u196fᐉ\u0001\ue607⨅ᐉ\u0000", new Object[]{"c", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new apkm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apkm.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
