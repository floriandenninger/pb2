package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class auel extends aonm implements aooz {
    private static final auel a;
    private static volatile aopf b;
    private int c;
    private String d = "";
    private awav e;
    private int f;
    private float g;
    private int h;

    static {
        auel auelVar = new auel();
        a = auelVar;
        aonm.registerDefaultInstance(auel.class, auelVar);
    }

    private auel() {
    }

    public static auek a() {
        return (auek) a.createBuilder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(String str) {
        str.getClass();
        this.c |= 1;
        this.d = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(int i) {
        this.c |= 16;
        this.h = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(auej auejVar) {
        this.f = auejVar.d;
        this.c |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(awav awavVar) {
        awavVar.getClass();
        this.e = awavVar;
        this.c |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(float f) {
        this.c |= 8;
        this.g = f;
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
                return newMessageInfo(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002\u0004ခ\u0003\u0005င\u0004", new Object[]{"c", "d", "e", "f", auej.a(), "g", "h"});
            case NEW_MUTABLE_INSTANCE:
                return new auel();
            case NEW_BUILDER:
                return new auek();
            case GET_DEFAULT_INSTANCE:
                return a;
            case GET_PARSER:
                aopf aopfVar = b;
                if (aopfVar == null) {
                    synchronized (auel.class) {
                        aopfVar = b;
                        if (aopfVar == null) {
                            aopfVar = new aonf(a);
                            b = aopfVar;
                        }
                    }
                }
                return aopfVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
