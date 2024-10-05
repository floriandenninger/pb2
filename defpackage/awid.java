package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awid extends aonm implements aooz {
    public static final awid a;
    public static final aonk b;
    private static volatile aopf h;
    public int c;
    public String e;
    public String f;
    public avgg g;
    private byte i = 2;
    public String d = "";

    static {
        awid awidVar = new awid();
        a = awidVar;
        aonm.registerDefaultInstance(awid.class, awidVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awidVar, awidVar, null, 152, aoqn.MESSAGE, awid.class);
    }

    private awid() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = "";
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
                return newMessageInfo(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0001\u0001ဈ\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ᐉ\u0004", new Object[]{"c", "d", "e", "f", "g"});
            case NEW_MUTABLE_INSTANCE:
                return new awid();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (awid.class) {
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
