package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class avug extends aonm implements aooz {
    public static final avug a;
    public static final aonk b;
    private static volatile aopf j;
    public int c;
    public String d = "";
    public float e;
    public int f;
    public int g;
    public int h;
    public long i;

    static {
        avug avugVar = new avug();
        a = avugVar;
        aonm.registerDefaultInstance(avug.class, avugVar);
        b = aonm.newSingularGeneratedExtension(aqug.a, avugVar, avugVar, null, 201, aoqn.MESSAGE, avug.class);
    }

    private avug() {
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
                return newMessageInfo(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0003ခ\u0001\u0004င\u0002\u0005င\u0003\u0006ဂ\u0005\u0007င\u0004", new Object[]{"c", "d", "e", "f", "g", "i", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new avug();
            case NEW_BUILDER:
                return new aone(a);
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = j;
                if (aopfVar == null) {
                    synchronized (avug.class) {
                        aopfVar = j;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            j = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
