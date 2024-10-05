package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class awul extends aonm implements aooz {
    public static final awul a;
    private static volatile aopf i;
    public int b;
    public int e;
    public aoot d = aoot.a;
    public aoot g = aoot.a;
    public aoot h = aoot.a;
    public String c = "";
    public String f = "";

    static {
        awul awulVar = new awul();
        a = awulVar;
        aonm.registerDefaultInstance(awul.class, awulVar);
    }

    private awul() {
    }

    public final aoot a() {
        aoot aootVar = this.h;
        if (!aootVar.b) {
            this.h = aootVar.a();
        }
        return this.h;
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0003\u0000\u0000\u0001ဈ\u0000\u00022\u0003င\u0001\u0004ဈ\u0002\u00052\u00062", new Object[]{"b", "c", "d", awuk.a, "e", "f", "g", awuj.a, "h", awui.a});
            case NEW_MUTABLE_INSTANCE:
                return new awul();
            case NEW_BUILDER:
                return new aone((char[][]) null, (int[][]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (awul.class) {
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
