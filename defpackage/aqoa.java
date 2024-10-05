package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqoa extends aonm implements aooz {
    public static final aqoa a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    private byte h = 2;
    public String d = "";
    public String e = "";
    public String f = "";

    static {
        aqoa aqoaVar = new aqoa();
        a = aqoaVar;
        aonm.registerDefaultInstance(aqoa.class, aqoaVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqoaVar, aqoaVar, null, 372486289, aoqn.MESSAGE, aqoa.class);
    }

    private aqoa() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0003\u0005\u0003\u0000\u0000\u0000\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new aqoa();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (aqoa.class) {
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
