package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class awcg extends aonm implements aooz {
    public static final awcg a;
    private static volatile aopf c;
    private int d;
    private aqyg e;
    private apxf f;
    private aqyg g;
    private aota h;
    private byte i = 2;
    public aony b = emptyProtobufList();

    static {
        awcg awcgVar = new awcg();
        a = awcgVar;
        aonm.registerDefaultInstance(awcg.class, awcgVar);
    }

    private awcg() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0005\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0003\u0005ᐉ\u0001\u0006ᐉ\u0002", new Object[]{"d", "e", "b", awcf.class, "h", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awcg();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = c;
                if (aopfVar == null) {
                    synchronized (awcg.class) {
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
