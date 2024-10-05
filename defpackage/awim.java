package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awim extends aonm implements aooz {
    public static final awim a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public String d = "";
    public String e;
    public String f;
    public String g;
    public long h;

    static {
        awim awimVar = new awim();
        a = awimVar;
        aonm.registerDefaultInstance(awim.class, awimVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, awimVar, awimVar, null, 155, aoqn.MESSAGE, awim.class);
    }

    private awim() {
        aomf aomfVar = aomf.b;
        this.e = "";
        this.f = "";
        this.g = "";
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return (byte) 1;
            case SET_MEMOIZED_IS_INITIALIZED:
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005", new Object[]{"c", "d", "e", "f", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new awim();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awim.class) {
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
