package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class asmo extends aonm implements aooz {
    public static final asmo a;
    public static final aonk b;
    private static volatile aopf g;
    public int c;
    public apxf e;
    public apxf f;
    private byte h = 2;
    public String d = "";

    static {
        asmo asmoVar = new asmo();
        a = asmoVar;
        aonm.registerDefaultInstance(asmo.class, asmoVar);
        b = aonm.newSingularGeneratedExtension(apxf.a, asmoVar, asmoVar, null, 350823535, aoqn.MESSAGE, asmo.class);
    }

    private asmo() {
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
                return newMessageInfo(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ဈ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
            case NEW_MUTABLE_INSTANCE:
                return new asmo();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = g;
                if (aopfVar == null) {
                    synchronized (asmo.class) {
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
