package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awii extends aonm implements aooz {
    public static final awii a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public int e;
    public awjq f;
    public awid g;
    private byte j = 2;
    public aomf d = aomf.b;
    public String h = "";

    static {
        awii awiiVar = new awii();
        a = awiiVar;
        aonm.registerDefaultInstance(awii.class, awiiVar);
        b = aonm.newSingularGeneratedExtension(atpo.b, awiiVar, awiiVar, null, 299918355, aoqn.MESSAGE, awii.class);
    }

    private awii() {
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.j);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.j = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ည\u0000\u0002ဌ\u0001\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဈ\u0005", new Object[]{"c", "d", "e", atrx.a(), "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awii();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awii.class) {
                        aopfVar = i;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            i = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
