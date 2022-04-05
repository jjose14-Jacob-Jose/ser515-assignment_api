package taigaAPI.pojo;

public class Milestone {
    private int project;
    private ProjectExtraInfo projectExtraInfo;
    private int id;
    private String name;
    private String owner;
    private String estimated_start;
    private String estimated_finish;
    private String created_date;
    private String modified_date;
    private boolean close;
    private float disponibility;
    private int order;
//
//        "project": 445524,
//                "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//            "id": 314805,
//            "name": "Sprint 4",
//            "slug": "sprint-4-119",
//            "owner": 487845,
//            "estimated_start": "2022-04-03",
//            "estimated_finish": "2022-04-17",
//            "created_date": "2022-02-03T00:44:37Z",
//            "modified_date": "2022-04-05T02:44:59.397Z",
//            "closed": false,
//            "disponibility": 0.0,
//            "order": 1,
//            "user_stories": [
//    {
//        "due_date": null,
//            "due_date_reason": "",
//            "due_date_status": "not_set",
//            "assigned_to": null,
//            "assigned_to_extra_info": null,
//            "status": 2682018,
//            "status_extra_info": {
//        "name": "New",
//                "color": "#70728F",
//                "is_closed": false
//    },
//        "project": 445524,
//            "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//        "id": 3938510,
//            "ref": 8,
//            "milestone": 314805,
//            "is_closed": false,
//            "created_date": "2022-02-05T04:26:56Z",
//            "modified_date": "2022-02-26T02:56:42Z",
//            "finish_date": null,
//            "subject": "Persist the state of the tool",
//            "client_requirement": false,
//            "team_requirement": false,
//            "external_reference": null,
//            "version": 3,
//            "is_blocked": false,
//            "blocked_note": "",
//            "backlog_order": 1644026194317142,
//            "sprint_order": 4,
//            "kanban_order": 1644035216506529,
//            "epics": null,
//            "points": {
//        "2715376": 5374007
//    },
//        "total_points": 13.0
//    },
//    {
//        "due_date": null,
//            "due_date_reason": "",
//            "due_date_status": "not_set",
//            "assigned_to": 502632,
//            "assigned_to_extra_info": {
//        "username": "jjose14",
//                "full_name_display": "Jacob Jose",
//                "photo": "https://media-protected.taiga.io/user/b/6/3/2/84bb4a7019aa67f0011cd1ba08622ee90101152478eb889345f4d3b54bbf/jacob_jose-dp.jpeg.80x80_q85_crop.jpg?token=YkvrJw%3Ak7x05jjDNDjUksLOsgkVqHjed53IqRspVjS-eZqNLdl7LV2SEcpHRoLKw3XcBsbpT5DM4CAzz2rjteqZm6ZKsw",
//                "big_photo": "https://media-protected.taiga.io/user/b/6/3/2/84bb4a7019aa67f0011cd1ba08622ee90101152478eb889345f4d3b54bbf/jacob_jose-dp.jpeg.300x300_q85_crop.jpg?token=YkvrJw%3AZ0lJp2QSRTXQBE2h2RPrF5lg4rDEKB9o5SFieu_DoeuWF8DBPollyOkB3HXT88p5BDF4W3pSASMcHSJaTm3zDg",
//                "gravatar_id": "89c4d360406834c7b9207a25701732a8",
//                "is_active": true,
//                "id": 502632
//    },
//        "status": 2682018,
//            "status_extra_info": {
//        "name": "New",
//                "color": "#70728F",
//                "is_closed": false
//    },
//        "project": 445524,
//            "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//        "id": 3938512,
//            "ref": 9,
//            "milestone": 314805,
//            "is_closed": false,
//            "created_date": "2022-02-05T04:27:55Z",
//            "modified_date": "2022-03-04T09:38:21Z",
//            "finish_date": null,
//            "subject": "Saving project information to a text tile. - TDD",
//            "client_requirement": false,
//            "team_requirement": false,
//            "external_reference": null,
//            "version": 6,
//            "is_blocked": false,
//            "blocked_note": "",
//            "backlog_order": 1644026194317144,
//            "sprint_order": 2,
//            "kanban_order": 1644035275300937,
//            "epics": null,
//            "points": {
//        "2715376": 5374005
//    },
//        "total_points": 5.0
//    },
//    {
//        "due_date": null,
//            "due_date_reason": "",
//            "due_date_status": "not_set",
//            "assigned_to": null,
//            "assigned_to_extra_info": null,
//            "status": 2682018,
//            "status_extra_info": {
//        "name": "New",
//                "color": "#70728F",
//                "is_closed": false
//    },
//        "project": 445524,
//            "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//        "id": 3938515,
//            "ref": 10,
//            "milestone": 314805,
//            "is_closed": false,
//            "created_date": "2022-02-05T04:52:00Z",
//            "modified_date": "2022-03-05T00:20:19Z",
//            "finish_date": null,
//            "subject": "Make use to shortcuts in commands",
//            "client_requirement": false,
//            "team_requirement": false,
//            "external_reference": null,
//            "version": 5,
//            "is_blocked": false,
//            "blocked_note": "",
//            "backlog_order": 1644026194317146,
//            "sprint_order": 3,
//            "kanban_order": 1644036720601319,
//            "epics": null,
//            "points": {
//        "2715376": 5374005
//    },
//        "total_points": 5.0
//    },
//    {
//        "due_date": null,
//            "due_date_reason": "",
//            "due_date_status": "not_set",
//            "assigned_to": null,
//            "assigned_to_extra_info": null,
//            "status": 2682018,
//            "status_extra_info": {
//        "name": "New",
//                "color": "#70728F",
//                "is_closed": false
//    },
//        "project": 445524,
//            "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//        "id": 3938522,
//            "ref": 24,
//            "milestone": 314805,
//            "is_closed": false,
//            "created_date": "2022-02-05T23:20:24Z",
//            "modified_date": "2022-02-26T02:53:24Z",
//            "finish_date": null,
//            "subject": "Import details from taiga using API",
//            "client_requirement": false,
//            "team_requirement": false,
//            "external_reference": null,
//            "version": 9,
//            "is_blocked": false,
//            "blocked_note": "",
//            "backlog_order": 1644026194317150,
//            "sprint_order": 1,
//            "kanban_order": 1644103224796037,
//            "epics": null,
//            "points": {
//        "2715376": 5374006
//    },
//        "total_points": 8.0
//    },
//    {
//        "due_date": null,
//            "due_date_reason": "",
//            "due_date_status": "not_set",
//            "assigned_to": null,
//            "assigned_to_extra_info": null,
//            "status": 2682018,
//            "status_extra_info": {
//        "name": "New",
//                "color": "#70728F",
//                "is_closed": false
//    },
//        "project": 445524,
//            "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//        "id": 3938528,
//            "ref": 65,
//            "milestone": 314805,
//            "is_closed": false,
//            "created_date": "2022-02-26T03:02:32Z",
//            "modified_date": "2022-03-05T02:48:49Z",
//            "finish_date": null,
//            "subject": "Implementing GUI",
//            "client_requirement": false,
//            "team_requirement": false,
//            "external_reference": null,
//            "version": 2,
//            "is_blocked": false,
//            "blocked_note": "",
//            "backlog_order": 1645844552764006,
//            "sprint_order": 5,
//            "kanban_order": 1645844552791392,
//            "epics": null,
//            "points": {
//        "2715376": 5374007
//    },
//        "total_points": 13.0
//    },
//    {
//        "due_date": null,
//            "due_date_reason": "",
//            "due_date_status": "not_set",
//            "assigned_to": null,
//            "assigned_to_extra_info": null,
//            "status": 2682018,
//            "status_extra_info": {
//        "name": "New",
//                "color": "#70728F",
//                "is_closed": false
//    },
//        "project": 445524,
//            "project_extra_info": {
//        "name": "Biscuits-Bandlamudi-Public",
//                "slug": "jacobjose123-biscuits-bandlamudi",
//                "logo_small_url": null,
//                "id": 445524
//    },
//        "id": 3938529,
//            "ref": 83,
//            "milestone": 314805,
//            "is_closed": false,
//            "created_date": "2022-03-04T21:50:07Z",
//            "modified_date": "2022-03-04T21:50:07Z",
//            "finish_date": null,
//            "subject": "Adding Issues to the tool",
//            "client_requirement": false,
//            "team_requirement": false,
//            "external_reference": null,
//            "version": 1,
//            "is_blocked": false,
//            "blocked_note": "",
//            "backlog_order": 1646430607390580,
//            "sprint_order": 6,
//            "kanban_order": 1646430607418757,
//            "epics": null,
//            "points": {
//        "2715376": 5374005
//    },
//        "total_points": 5.0
//    }
//    ],
//            "total_points": 49.0,
//            "closed_points": null
}