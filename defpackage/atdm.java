package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class atdm extends aonm implements aooz {
    public static final atdm a;
    private static volatile aopf b;
    private int c;
    private aulq d;
    private apxf e;
    private apxf f;
    private aota g;
    private byte h = 2;

    static {
        atdm atdmVar = new atdm();
        a = atdmVar;
        aonm.registerDefaultInstance(atdm.class, atdmVar);
    }

    private atdm() {
        emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0004\u0013\u0004\u0000\u0000\u0004\u0004ᐉ\b\u0005ᐉ\n\bᐉ\u0006\u0013ᐉ\u0003", new Object[]{"c", "f", "g", "e", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new atdm();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (atdm.class) {
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
