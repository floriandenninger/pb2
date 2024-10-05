package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmx extends aonm implements aooz {
    public static final asmx a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public aqto d;
    public apxf e;
    public apxf g;
    private byte i = 2;
    public String f = "";

    static {
        asmx asmxVar = new asmx();
        a = asmxVar;
        aonm.registerDefaultInstance(asmx.class, asmxVar);
        b = aonm.newSingularGeneratedExtension(aulp.a, asmxVar, asmxVar, null, 267256503, aoqn.MESSAGE, asmx.class);
    }

    private asmx() {
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new asmx();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (asmx.class) {
                        aopfVar = h;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            h = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
