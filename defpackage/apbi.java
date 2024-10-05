package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apbi extends aonm implements aooz {
    public static final apbi a;
    private static volatile aopf h;
    public int b;
    public String c = "";
    public boolean d;
    public apbk e;
    public aony f;
    public aony g;

    static {
        apbi apbiVar = new apbi();
        a = apbiVar;
        aonm.registerDefaultInstance(apbi.class, apbiVar);
    }

    private apbi() {
        emptyIntList();
        emptyProtobufList();
        this.f = emptyProtobufList();
        this.g = emptyProtobufList();
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0003ဇ\u0001\u0005\u001b\u0006\u001b\u0007ဉ\u0002", new Object[]{"b", "c", "d", "f", apbk.class, "g", apbk.class, "e"});
            case NEW_MUTABLE_INSTANCE:
                return new apbi();
            case NEW_BUILDER:
                return new aone((byte[][][]) null, (boolean[]) null);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = h;
                if (aopfVar == null) {
                    synchronized (apbi.class) {
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
