package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class arzk extends aonm implements aooz {
    public static final arzk a;
    private static volatile aopf d;
    public arnd b;
    private int e;
    private aota f;
    private aqzg g;
    private byte h = 2;
    public aony c = emptyProtobufList();

    static {
        arzk arzkVar = new arzk();
        a = arzkVar;
        aonm.registerDefaultInstance(arzk.class, arzkVar);
    }

    private arzk() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001̉\u0004\u0000\u0001\u0004\u0001ᐉ\u0000\u0002Л\u0004ᐉ\u0001̉ᐉ\u0003", new Object[]{"e", "b", "c", arzl.class, "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new arzk();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = d;
                if (aopfVar == null) {
                    synchronized (arzk.class) {
                        aopfVar = d;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            d = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
