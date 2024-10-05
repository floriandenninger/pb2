package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class apgm extends aonm implements aooz {
    public static final apgm a;
    private static volatile aopf c;
    public int b;
    private int d;
    private apgl e;
    private aota f;
    private aulq g;
    private byte h = 2;

    static {
        apgm apgmVar = new apgm();
        a = apgmVar;
        aonm.registerDefaultInstance(apgm.class, apgmVar);
    }

    private apgm() {
        aomf aomfVar = aomf.b;
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.h);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.h = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0002\u0006\u0004\u0000\u0000\u0003\u0002ᐉ\u0001\u0003ᐉ\u0002\u0005ဌ\u0004\u0006ᐉ\u0005", new Object[]{"d", "e", "f", "b", aquw.h, "g"});
            case NEW_MUTABLE_INSTANCE:
                return new apgm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (apgm.class) {
                        aopfVar = c;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            c = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
