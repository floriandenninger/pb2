package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apku extends aonm implements aooz {
    public static final apku a;
    private static volatile aopf b;
    private int c;
    private aqyg d;
    private aqyg e;
    private apmh f;
    private apmh g;
    private aota h;
    private byte i = 2;

    static {
        apku apkuVar = new apku();
        a = apkuVar;
        aonm.registerDefaultInstance(apku.class, apkuVar);
    }

    private apku() {
        emptyProtobufList();
        emptyProtobufList();
        aomf aomfVar = aomf.b;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\u000b\u0005\u0000\u0000\u0005\u0003ᐉ\u0004\u0004ᐉ\u0005\bᐉ\b\nᐉ\u0003\u000bᐉ\u0006", new Object[]{"c", "e", "f", "h", "d", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apku();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (apku.class) {
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
