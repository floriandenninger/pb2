package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aqlu extends aonm implements aooz {
    public static final aqlu a;
    public static final aonk b;
    private static volatile aopf i;
    public int c;
    public aqlr d;
    public aqlv e;
    public String f;
    public aqlp g;
    public aqls h;
    private awnw j;
    private awnl k;
    private byte l = 2;

    static {
        aqlu aqluVar = new aqlu();
        a = aqluVar;
        aonm.registerDefaultInstance(aqlu.class, aqluVar);
        b = aonm.newSingularGeneratedExtension(awog.a, aqluVar, aqluVar, null, 355246692, aoqn.MESSAGE, aqlu.class);
    }

    private aqlu() {
        emptyProtobufList();
        emptyProtobufList();
        this.f = "";
        emptyProtobufList();
    }

    @Override // defpackage.aonm
    protected final Object dynamicMethod(aonl aonlVar, Object obj, Object obj2) {
        aonl aonlVar2 = aonl.GET_MEMOIZED_IS_INITIALIZED;
        switch (aonlVar) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.l);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.l = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return newMessageInfo(a, "\u0001\u0007\u0000\u0001\u0003$\u0007\u0000\u0000\u0002\u0003ဈ\u0012\u0006ᐉ\u0007\u000fဉ\u000b\u0011ဉ\u0011 ဉ\f#ဉ\u001d$ᐉ\u001e", new Object[]{"c", "f", "j", "d", "e", "k", "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new aqlu();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = i;
                if (aopfVar == null) {
                    synchronized (aqlu.class) {
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
