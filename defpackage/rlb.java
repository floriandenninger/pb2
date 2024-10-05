package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class rlb extends aonm implements aooz {
    public static final rlb a;
    private static volatile aopf i;
    public int b;
    public long e;
    public float f;
    public double g;
    public String c = "";
    public String d = "";
    public aony h = emptyProtobufList();

    static {
        rlb rlbVar = new rlb();
        a = rlbVar;
        aonm.registerDefaultInstance(rlb.class, rlbVar);
    }

    private rlb() {
    }

    public final void a() {
        aony aonyVar = this.h;
        if (aonyVar.c()) {
            return;
        }
        this.h = aonm.mutableCopy(aonyVar);
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", rlb.class});
            case NEW_MUTABLE_INSTANCE:
                return new rlb();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (rlb.class) {
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
