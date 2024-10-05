package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqjs extends aonm implements aooz {
    public static final aqjs a;
    private static volatile aopf e;
    public int b;
    public apxf c;
    private aqyg f;
    private aulq g;
    private aota h;
    private byte i = 2;
    public String d = "";

    static {
        aqjs aqjsVar = new aqjs();
        a = aqjsVar;
        aonm.registerDefaultInstance(aqjs.class, aqjsVar);
    }

    private aqjs() {
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0003\b\u0005\u0000\u0000\u0004\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ᐉ\b\u0007ᐉ\u0006\bဈ\u0007", new Object[]{"b", "f", "c", "h", "g", "d"});
            case NEW_MUTABLE_INSTANCE:
                return new aqjs();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = e;
                if (aopfVar == null) {
                    synchronized (aqjs.class) {
                        aopfVar = e;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            e = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
